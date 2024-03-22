package daazi.app.appmediaescolarmvc.ui.Bimestre4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import daazi.app.appmediaescolarmvc.R;
import daazi.app.appmediaescolarmvc.databinding.FragmentBimestre4Binding;


public class Bimestre4Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FragmentBimestre4Binding binding = FragmentBimestre4Binding.inflate(inflater,container,false);
        return binding.getRoot();

    }
}