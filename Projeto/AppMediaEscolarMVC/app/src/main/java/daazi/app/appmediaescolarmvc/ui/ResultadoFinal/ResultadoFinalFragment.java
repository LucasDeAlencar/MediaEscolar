package daazi.app.appmediaescolarmvc.ui.ResultadoFinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import daazi.app.appmediaescolarmvc.R;
import daazi.app.appmediaescolarmvc.databinding.FragmentResultadoFinalBinding;

public class ResultadoFinalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentResultadoFinalBinding binding = FragmentResultadoFinalBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}