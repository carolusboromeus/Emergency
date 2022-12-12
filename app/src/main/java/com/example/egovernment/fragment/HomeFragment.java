package com.example.egovernment.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.egovernment.adapter.HomeAdapter;
import com.example.egovernment.model.HomeModel;
import com.example.egovernment.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<HomeModel> homeModelArrayList;
    private String[] companyArray, phoneArray;
    private int[] logoArray;
    private RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();

        recyclerView = view.findViewById(R.id.phoneRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        HomeAdapter homeAdapter = new HomeAdapter(getContext(), homeModelArrayList);
        recyclerView.setAdapter(homeAdapter);
        homeAdapter.notifyDataSetChanged();
    }

    private void dataInitialize() {

        homeModelArrayList = new ArrayList<>();

        logoArray = new int[] {
                R.drawable.polri,
                R.drawable.damkar,
                R.drawable.basarnas,
                R.drawable.health,
                R.drawable.bnpb,
                R.drawable.pln,
                R.drawable.pamjaya,
                R.drawable.palyja,
                R.drawable.ojk,
        };

        companyArray  = new String[] {
                "Polisi Republik Indonesia",
                "Pemadam Kebakaran",
                "Badan Nasional Pencarian dan Pertolongan",
                "Rumah Sakit",
                "Badan Nasional Penanggulangan Bencana",
                "Perusahaan Listrik Negara",
                "PAM Jaya",
                "PAM Lyonnaise Jaya",
                "Sistem Layanan Informasi Keuangan",
        };

        phoneArray = new String[] {
                "Emergency Call: 110",
                "Emergency Call: 113",
                "Emergency Call: 115",
                "Emergency Call: 119",
                "Emergency Call: 117",
                "Emergency Call: 123",
                "Call Center: +62 21 5704250",
                "Call Center: +62 21 2997 9999",
                "Emergency Call: 157",
        };

        for (int i=0;i<companyArray.length; i++) {
            HomeModel homeModel = new HomeModel(companyArray[i], phoneArray[i], logoArray[i]);
            homeModelArrayList.add(homeModel);
        }
    }

}