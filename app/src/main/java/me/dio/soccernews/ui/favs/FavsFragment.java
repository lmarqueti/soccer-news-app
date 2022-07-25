package me.dio.soccernews.ui.favs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import me.dio.soccernews.databinding.FragmentFavsBinding;

public class FavsFragment extends Fragment {

    private FragmentFavsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavsViewModel FavsViewModel =
                new ViewModelProvider(this).get(FavsViewModel.class);

        binding = FragmentFavsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        FavsViewModel.getText().observe(getViewLifecycleOwner(), binding.textFavs::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}