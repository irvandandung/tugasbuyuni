package com.nyalain.user.tugasbuyuni.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nyalain.user.tugasbuyuni.R;

public class tambah extends Fragment {
    EditText editAngka1, editAngka2;
    TextView tvHasil;
    Button kurang;

    Integer angka1, angka2;
    public tambah(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tambah, container, false);
        editAngka1 = view.findViewById(R.id.angka1);
        editAngka1.setText("0");
        editAngka2 = view.findViewById(R.id.angka2);
        editAngka2.setText("0");
        tvHasil = view.findViewById(R.id.txthasil);
        kurang = view.findViewById(R.id.buttonkurang);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        proses();
    }

    private void proses() {
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasiltambah();
            }
        });
    }

    private void hasiltambah() {

        angka1 = Integer.parseInt(editAngka1.getText().toString());
        angka2 = Integer.parseInt(editAngka2.getText().toString());

        if (angka1.toString().isEmpty()){
            tvHasil.setText("Isi terlebih dahulu");
        }
        else if (angka2.toString().isEmpty()) {
            tvHasil.setText("Isi terlebih dahulu");
        }else {
            Integer hasil = angka1 + angka2;
            tvHasil.setText(String.valueOf(hasil));
        }
    }
}
