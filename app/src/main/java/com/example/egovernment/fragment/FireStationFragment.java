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
import android.widget.Toast;

import com.example.egovernment.R;
import com.example.egovernment.model.EmergencyModel;
import com.example.egovernment.adapter.EmergencyAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FireStationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FireStationFragment extends Fragment {

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

    public FireStationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PendidikanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FireStationFragment newInstance(String param1, String param2) {
        FireStationFragment fragment = new FireStationFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_fire_station, container, false);
        return rootView;
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
                R.drawable.fs_01,
                R.drawable.fs_02,
                R.drawable.fs_03,
                R.drawable.fs_04,
                R.drawable.fs_05,
                R.drawable.fs_06,
                R.drawable.fs_07,
                R.drawable.fs_08,
                R.drawable.fs_09,
                R.drawable.fs_10,
                R.drawable.fs_11,
        };

        String[] title = {
                "DINAS PEMADAM KEBAKARAN CIPULIR",
                "DINAS PEMADAM KEBAKARAN SUKU DINAS (SUDIN)",
                "DINAS PERBEKALAN PEMADAM DKI",
                "PEMADAM KEBAKARAN",
                "PEMADAM KEBAKARAN (CENGKARENG BARAT)",
                "PEMADAM KEBAKARAN JAKARTA SELATAN",
                "PEMADAM KEBAKARAN JAKARTA TIMUR 1",
                "PEMADAM KEBAKARAN JAKARTA TIMUR 2",
                "PEMADAM KEBAKARAN KEMBANGAN SELATAN",
                "PEMADAM KEBAKARAN PEMERINTAH DAERAH",
                "PEMADAM KEBAKARAN PEMERINTAH DAERAH JAKARTA TIMUR",
        };

        String[] sub = {
                "Jl. Jalan Ciledug Raya\n" +
                        "Kel. Cipulir, Kec. Kebayoran Lama\n" +
                        "Kota Jakarta Selatan 12230\n" +
                        "Zone : Kebayoran Lama",
                "Jl. Jalan Irian\n" +
                        "Kel. Sukapura, Kec. Cilincing\n" +
                        "Kota Jakarta Utara 14140\n" +
                        "Zone : Cilincing",
                "Jl. Jalan H. Seman\n" +
                        "Kel. Susukan, Kec. Ciracas\n" +
                        "Kota Jakarta Timur 13750\n" +
                        "Zone : Ciracas",
                "Jl. Jalan Sungai Barito\n" +
                        "Kel. Semper Barat, Kec. Cilincing\n" +
                        "Kota Jakarta Utara 14130\n" +
                        "Zone : Cilincing",
                "Jl. Jalan Lingkar Luar Barat No. 3 RT 06/07\n" +
                        "Kel. Cengkareng Barat, Kec. Cengkareng\n" +
                        "Kota Jakarta Barat 11730\n" +
                        "Zone : Cengkareng",
                "Jl. Jalan Golf Fatmawati\n" +
                        "Kel. Cilandak Barat, Kec. Cilandak\n" +
                        "Kota Jakarta Selatan 12430\n" +
                        "Zone : Cilandak",
                "Jl. Jalan Pondok Kopi 6\n" +
                        "Kel. Malaka Sari, Kec. Duren Sawit\n" +
                        "Kota Jakarta Timur 13460\n" +
                        "Zone : Duren Sawit",
                "Jl. Jalan Nusa Indah 5\n" +
                        "Kel. Malaka Sari, Kec. Duren Sawit\n" +
                        "Kota Jakarta Timur 13460\n" +
                        "Zone : Duren Sawit",
                "Jl. Jalan Puri Permai\n" +
                        "Kel. Kembangan Selatan, Kec. Kembangan\n" +
                        "Kota Jakarta Barat 11610\n" +
                        "Zone : Kembangan",
                "Jl. Jalan Elang\n" +
                        "Kel. Pesanggrahan, Kec. Pesanggrahan\n" +
                        "Kota Jakarta Selatan 12320\n" +
                        "Zone : Pesanggrahan",
                "Jl. Jalan Batu Ampar\n" +
                        "Kel. Batu Ampar, Kec. Kramat Jati\n" +
                        "Kota Jakarta Timur 13520\n" +
                        "Zone : Kramat Jati"
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