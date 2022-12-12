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
 * Use the {@link PoliceStationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PoliceStationFragment extends Fragment {

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

    public PoliceStationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Kependudukan.
     */
    // TODO: Rename and change types and number of parameters
    public static PoliceStationFragment newInstance(String param1, String param2) {
        PoliceStationFragment fragment = new PoliceStationFragment();
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
        return inflater.inflate(R.layout.fragment_police_station, container, false);
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
                R.drawable.ps_01,
                R.drawable.ps_02,
                R.drawable.ps_03,
                R.drawable.ps_04,
                R.drawable.ps_05,
                R.drawable.ps_06,
                R.drawable.ps_07,
                R.drawable.ps_08,
                R.drawable.ps_09,
                R.drawable.ps_10,
                R.drawable.ps_11,
                R.drawable.ps_12,
                R.drawable.ps_13,
                R.drawable.ps_14,
                R.drawable.ps_15,
                R.drawable.ps_16,
                R.drawable.ps_17,
                R.drawable.ps_18,
                R.drawable.ps_19,
                R.drawable.ps_20,
        };

        String[] title = {
                "BRIMOB POLISI",
                "DIREKTORAT LALU LINTAS POLRI",
                "DIRLANTAS POLDA METRO JAYA",
                "KANTOR BERSAMA SAMSAT WILAYAH JAKARTA SELATAN",
                "KANTOR BERSAMA SAMSAT WILAYAH JAKARTA UTARA",
                "KANTOR POLISI (POLSEK) KEBON NANAS",
                "KANTOR POLISI PELABUHAN MARUNDA",
                "KANTOR POLSEK METRO PASAR REBO",
                "MABES POLRI (BRIMOB & INTERPOL)",
                "MABES POLRI (POLANTAS)",
                "POLDA METRO JAYA",
                "POLISI RESORT BOGOR",
                "POLISI SEKTOR KELAPA GADING",
                "POLISI SEKTOR METRO JAGA KARSA",
                "POLISI SEKTOR PASAR MINGGU",
                "POLRES JAKARTA BARAT",
                "POLRES JAKARTA TIMUR",
                "POLRES JAKARTA UTARA",
                "POLRES METRO JAKARTA PUSAT",
                "POLRES METRO JAKARTA SELATAN",
        };

        String[] sub = {
                "Jl. Jalan Prapatan\n" +
                        "Kel. Senen, Kec. Senen\n" +
                        "Kota Jakarta Pusat 10410\n" +
                        "Zone : Senen",
                "Jl. Jalan Letjen. MT Haryono Kav. 37-38\n" +
                        "Kel. Cikoko, Kec. Pancoran\n" +
                        "Kota Jakarta Selatan 12770\n" +
                        "Zone : Pancoran",
                "Jl. Jalan Mayjend. D.I. Panjaitan Kav.55\n" +
                        "Kel. Cipinang Besar Selatan, Kec. Jatinegara\n" +
                        "Kota Jakarta Timur 13410\n" +
                        "Zone : Jati Negara",
                "Jl. Jalan Jendral Sudirman\n" +
                        "Kel. Senayan, Kec. Kebayoran Baru\n" +
                        "Kota Jakarta Selatan 12190\n" +
                        "Zone : Kebayoran Baru",
                "Jl. Jalan Gunung Sahari Raya\n" +
                        "Kel. Pademangan Barat, Kec. Pademangan\n" +
                        "Kota Jakarta Utara 14420\n" +
                        "Zone : Pademangan",
                "Jl. Jalan Mayjend. D.I. Panjaitan\n" +
                        "Kel. Cipinang Besar Selatan, Kec. Jatinegara\n" +
                        "Kota Jakarta Timur 13410\n" +
                        "Zone : Jati Negara",
                "Jl. Jalan Jayapura RT 07/04\n" +
                        "Kel. Cilincing, Kec. Cilincing\n" +
                        "Kota Jakarta Utara 14120\n" +
                        "Zone : Cilincing",
                "Jl. Jalan Raya Bogor RT 05/08\n" +
                        "Kel. Pekayon, Kec. Pasar Rebo\n" +
                        "Kota Jakarta Timur 13710\n" +
                        "Zone : Pasar Rebo",
                "Jl. Jalan Trunojoyo No.3\n" +
                        "Kel. Selong, Kec. Kebayoran Baru\n" +
                        "Kota Jakarta Selatan 12110\n" +
                        "Zone : Kebayoran Baru",
                "Jl. Jalan Letjen. MT Haryono\n" +
                        "Kel. Cikoko, Kec. Pancoran\n" +
                        "Kota Jakarta Selatan 12770\n" +
                        "Zone : Pancoran",
                "Jl. Jalan Jendral Sudirman\n" +
                        "Kel. Karet Semanggi, Kec. Setiabudi\n" +
                        "Kota Jakarta Selatan 12930\n" +
                        "Zone : Kebayoran Baru",
                "Jl. Jalan Tegar Beriman\n" +
                        "Kel. Kampung Tengah, Kec. Kramat Jati\n" +
                        "Kota Jakarta Timur 16914\n" +
                        "Zone : Cibinong",
                "Jl. Jalan Boulevard Timur Raya\n" +
                        "Kel. Pegangsaan Dua, Kec. Kelapa Gading\n" +
                        "Kota Jakarta Utara 14250\n" +
                        "Zone : Kelapa Gading",
                "Jl. Jalan Timbul\n" +
                        "Kel. Cipedak, Kec. Jagakarsa\n" +
                        "Kota Jakarta Selatan 12630\n" +
                        "Zone : Jaga Karsa",
                "Jl. Jalan Ragunan Raya\n" +
                        "Kel. Kebagusan, Kec. Pasar Minggu\n" +
                        "Kota Jakarta Selatan 12520\n" +
                        "Zone : Pasar Minggu",
                "Jl. Jalan Letjen. S. Parman No.31\n" +
                        "Kel. Slipi, Kec. Palmerah\n" +
                        "Kota Jakarta Barat 11410\n" +
                        "Zone : Palmerah",
                "Jl. Jalan Matraman Raya No.224\n" +
                        "Kel. Kebon Manggis, Kec. Matraman\n" +
                        "Kota Jakarta Timur 13150\n" +
                        "Zone : Jati Negara",
                "Jl. Jalan Melur 1\n" +
                        "Kel. Rawa Badak Utara, Kec. Koja\n" +
                        "Kota Jakarta Utara 14230\n" +
                        "Zone : Koja",
                "Jl. Jalan Kramat Raya No.61\n" +
                        "Kel. Kramat, Kec. Senen\n" +
                        "Kota Jakarta Pusat 15570\n" +
                        "Zone : Senen",
                "Jl. Jalan Wijaya No. 42\n" +
                        "Kel. Petogogan, Kec. Kebayoran Baru\n" +
                        "Kota Jakarta Selatan 12170\n" +
                        "Zone : Kebayoran Baru"
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