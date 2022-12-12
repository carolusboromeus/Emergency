package com.example.egovernment.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.egovernment.R;
import com.example.egovernment.adapter.EmergencyAdapter;
import com.example.egovernment.model.EmergencyModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HealthCenterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HealthCenterFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<EmergencyModel> emergencyArrayList;
    private RecyclerView lvSingle;
    private EmergencyAdapter emergencyAdapter;
    private Context context;

    public HealthCenterFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KesehatanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HealthCenterFragment newInstance(String param1, String param2) {
        HealthCenterFragment fragment = new HealthCenterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_health_center, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        lvSingle = view.findViewById(R.id.emergencyRV);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        lvSingle.setLayoutManager(gridLayoutManager);

        emergencyAdapter = new EmergencyAdapter(getContext(), emergencyArrayList);
        lvSingle.setAdapter(emergencyAdapter);
        lvSingle.setHasFixedSize(true);
    }

    private void loadData() {
        emergencyArrayList = new ArrayList<>();

        int[] img = {
                R.drawable.hc_01,
                R.drawable.hc_02,
                R.drawable.hc_03,
                R.drawable.hc_04,
                R.drawable.hc_05,
                R.drawable.hc_06,
                R.drawable.hc_07,
                R.drawable.hc_08,
                R.drawable.hc_09,
                R.drawable.hc_10,
                R.drawable.hc_11,
                R.drawable.hc_12,
                R.drawable.hc_13,
                R.drawable.hc_14,
                R.drawable.hc_15,
                R.drawable.hc_16,
                R.drawable.hc_17,
                R.drawable.hc_18,
                R.drawable.hc_19,
                R.drawable.hc_20,
                R.drawable.hc_21,
                R.drawable.hc_22,
                R.drawable.hc_23,
                R.drawable.hc_24,
                R.drawable.hc_25,
                R.drawable.hc_26,
                R.drawable.hc_27,
                R.drawable.hc_28,
                R.drawable.hc_29,
                R.drawable.hc_30,
                R.drawable.hc_31,
                R.drawable.hc_32,
        };

        String[] title = {
                "BALAI KESEHATAN DESA PUTRA",
                "BALAI KESEHATAN PENERBANGAN",
                "BALAI KESEHATAN ST. CAROLUS CENGKARENG",
                "LEMBAGA KESEHATAN GIGI & MULUT TNI-AL",
                "PUKESMAS JOGLO",
                "PUKESMAS MARUNDA",
                "PUSAT KESEHATAN MASYARAKAT KELAPA GADING TIMUR 2",
                "PUSAT REHABILITASI NARKOBA",
                "PUSKEMAS DURI KOSAMBI",
                "PUSKEMAS KARET",
                "PUSKEMAS SRENGSENG",
                "PUSKESMAS BARU",
                "PUSKESMAS BATU AMPAR",
                "PUSKESMAS CAKUNG BARAT",
                "PUSKESMAS CEMPAKA PUTIH",
                "PUSKESMAS CILANDAK",
                "PUSKESMAS CILANDAK LAMA",
                "PUSKESMAS CILINCING",
                "PUSKESMAS CIPAYUNG",
                "PUSKESMAS CIPUTAT",
                "PUSKESMAS CIRACAS",
                "PUSKESMAS DESA PUTRA",
                "PUSKESMAS DURI KEPA",
                "PUSKESMAS GEDONG",
                "PUSKESMAS GROGOL",
                "PUSKESMAS GROGOL PETAMBURAN",
                "PUSKESMAS JATIJAJAR",
                "PUSKESMAS JATINEGARA",
                "PUSKESMAS JELAMBAR",
                "PUSKESMAS JOGLO 2",
                "PUSKESMAS KAMAL MUARA",
                "PUSKESMAS KAPUK",
        };

        String[] sub = {
                "Jl. Jalan Desa Putra 07\n" +
                        "Kel. Srengseng Sawah, Kec. Jagakarsa\n" +
                        "Kota Jakarta Selatan 12640\n" +
                        "Zone : Jaga Karsa",
                "Jl. Jalan Industri\n" +
                        "Kel. Pademangan Timur, Kec. Pademangan\n" +
                        "Kota Jakarta Utara 14410\n" +
                        "Zone : Sawah Besar",
                "Jl. Jalan Puspa Raya\n" +
                        "Kel. Kapuk, Kec. Cengkareng\n" +
                        "Kota Jakarta Barat 11720\n" +
                        "Zone : Cengkareng",
                "Jl. Jalan Setia Bomo\n" +
                        "Kel. Halim Perdanakusuma, Kec. Makasar\n" +
                        "Kota Jakarta Timur 13510\n" +
                        "Zone : Makasar",
                "Jl. Jalan Mubarok\n" +
                        "Kel. Joglo, Kec. Kembangan\n" +
                        "Kota Jakarta Barat 11640\n" +
                        "Zone : Kembangan",
                "Jl. Jalan Marunda Baru\n" +
                        "Kel. Marunda, Kec. Cilincing\n" +
                        "Kota Jakarta Utara 14150\n" +
                        "Zone : Cilincing",
                "Jl. Jalan Biru Laut Timur\n" +
                        "Kel. Kelapa Gading Timur, Kec. Kelapa Gading\n" +
                        "Kota Jakarta Utara 14240\n" +
                        "Zone : Kelapa Gading",
                "Jl. Jalan Bali Raya No. 15\n" +
                        "Kel. Sumur Batu, Kec. Kemayoran\n" +
                        "Kota Jakarta Pusat 16810\n" +
                        "Zone : Sukaraja",
                "Jl. Jalan Duri Kosambi\n" +
                        "Kel. Duri Kosambi, Kec. Cengkareng\n" +
                        "Kota Jakarta Barat 11750\n" +
                        "Zone : Cengkareng",
                "Jl. Jalan Karet Karya 2 RT 011/02\n" +
                        "Kel. Karet, Kec. Setiabudi\n" +
                        "Kota Jakarta Selatan 12920\n" +
                        "Zone : Kuningan",
                "Jl. Jalan Srengseng\n" +
                        "Kel. Srengseng, Kec. Kembangan\n" +
                        "Kota Jakarta Barat 11630\n" +
                        "Zone : Kembangan",
                "Jl. Jalan Serba Guna\n" +
                        "Kel. Cijantung, Kec. Pasar Rebo\n" +
                        "Kota Jakarta Timur 13770\n" +
                        "Zone : Pasar Rebo",
                "Jl. Jalan H.Saidan\n" +
                        "Kel. Batu Ampar, Kec. Kramat Jati\n" +
                        "Kota Jakarta Timur 13520\n" +
                        "Zone : Kramat Jati",
                "Jl. Jalan Puskesmas No. 3\n" +
                        "Kel. Cakung Barat, Kec. Cakung\n" +
                        "Kota Jakarta Timur 13910\n" +
                        "Zone : Cakung",
                "Jl. Jalan Rawa Sari Timur\n" +
                        "Kel. Cempaka Putih Timur, Kec. Cempaka Putih\n" +
                        "Kota Jakarta Pusat 10510\n" +
                        "Zone : Cempaka Putih",
                "Jl. Jalan Duta Niaga 3\n" +
                        "Kel. Cilandak Barat, Kec. Cilandak\n" +
                        "Kota Jakarta Selatan 12430\n" +
                        "Zone : Cilandak",
                "Jl. Jalan Fatmawati\n" +
                        "Kel. Cilandak Barat, Kec. Cilandak\n" +
                        "Kota Jakarta Selatan 12430\n" +
                        "Zone : Cilandak",
                "Jl. Jalan Kebantenan\n" +
                        "Kel. Semper Timur, Kec. Cilincing\n" +
                        "Kota Jakarta Utara 14130\n" +
                        "Zone : Cilincing",
                "Jl. Jalan Budi Murni No. 45\n" +
                        "Kel. Cipayung, Kec. Cipayung\n" +
                        "Kota Jakarta Timur 15411\n" +
                        "Zone : Cipayung",
                "Jl. Jalan Ki Hajar Dewantoro\n" +
                        "Kel. Cipayung, Kec. Cipayung\n" +
                        "Kota Jakarta Timur 15411\n" +
                        "Zone : Pamulang",
                "Jl. Jalan Puskesmas\n" +
                        "Kel. Ciracas, Kec. Ciracas\n" +
                        "Kota Jakarta Timur 13740\n" +
                        "Zone : Ciracas",
                "Jl. Jalan Desa Putra\n" +
                        "Kel. Srengseng Sawah, Kec. Jagakarsa\n" +
                        "Kota Jakarta Selatan 12640\n" +
                        "Zone : Jaga Karsa",
                "Jl. Jalan Kepa Timur Raya No. 106\n" +
                        "Kel. Duri Kepa, Kec. Kebon Jeruk\n" +
                        "Kota Jakarta Barat 11510\n" +
                        "Zone : Kebon Jeruk",
                "Jl. Jalan Komplek Rindam Jaya\n" +
                        "Kel. Gedong, Kec. Pasar Rebo\n" +
                        "Kota Jakarta Timur 13760\n" +
                        "Zone : Pasar Rebo",
                "Jl. Jalan Pramuka\n" +
                        "Kel. Grogol, Kec. Grogol Petamburan\n" +
                        "Kota Jakarta Barat 11450\n" +
                        "Zone : Limo",
                "Jl. Jalan Angka Jaya\n" +
                        "Kel. Wijaya Kusuma, Kec. Grogol Petamburan\n" +
                        "Kota Jakarta Barat 11460\n" +
                        "Zone : Grogol Petamburan",
                "Jl. Jalan Setu Jati Jajar\n" +
                        "Kel. Cilangkap, Kec. Cipayung\n" +
                        "Kota Jakarta Timur 16958\n" +
                        "Zone : Cimanggis",
                "Jl. Jalan Bekasi Raya\n" +
                        "Kel. Jatinegara, Kec. Cakung\n" +
                        "Kota Jakarta Timur 13930\n" +
                        "Zone : Cakung",
                "Jl. Jalan Latu Menten 7\n" +
                        "Kel. Jelambar, Kec. Grogol Petamburan\n" +
                        "Kota Jakarta Barat 11460\n" +
                        "Zone : Grogol Petamburan",
                "Jl. Jalan Pamancar\n" +
                        "Kel. Joglo, Kec. Kembangan\n" +
                        "Kota Jakarta Barat 11640\n" +
                        "Zone : Kembangan",
                "Jl. Jalan Kamal Pantai No. 18\n" +
                        "Kel. Kamal Muara, Kec. Penjaringan\n" +
                        "Kota Jakarta Utara 14470\n" +
                        "Zone : Penjaringan",
                "Jl. Jalan Kapuk Raya No. 16\n" +
                        "Kel. Kapuk, Kec. Cengkareng\n" +
                        "Kota Jakarta Barat 11720\n" +
                        "Zone : Cengkareng",
        };

        for (int i=0; i<img.length;i++){
            EmergencyModel emergencyModel = new EmergencyModel();
            emergencyModel.setImageEmergency(img[i]);
            emergencyModel.setTitleEmergency(title[i]);
            emergencyModel.setSubEmergency(sub[i]);
            emergencyArrayList.add(emergencyModel);
        }
    }
}