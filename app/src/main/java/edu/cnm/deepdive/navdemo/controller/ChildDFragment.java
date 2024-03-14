package edu.cnm.deepdive.navdemo.controller;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.navdemo.databinding.FragmentChildDBinding;
import edu.cnm.deepdive.navdemo.viewmodel.CommonViewModel;

public class ChildDFragment extends Fragment {

  private FragmentChildDBinding binding;
  private boolean updatingContent;
  private CommonViewModel viewModel;

  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    binding = FragmentChildDBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    binding.content.setSaveEnabled(false);
    binding.content.addTextChangedListener(new ContentWatcher());
    binding.navigateC.setOnClickListener((v) -> Navigation.findNavController(binding.getRoot())
        .navigate(ChildDFragmentDirections.navigateToC()));
    viewModel = new ViewModelProvider(requireActivity()).get(CommonViewModel.class);
    viewModel
        .getSharedContent()
        .observe(getViewLifecycleOwner(), (content) -> {
          if (!updatingContent) {
            binding.content.setText(content);
          } else {
            updatingContent = false;
          }

        });
  }

  private class ContentWatcher implements TextWatcher {

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
      // Do nothing
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
      // Do nothing
    }

    @Override
    public void afterTextChanged(Editable content) {
      updatingContent = true;
      viewModel.getSharedContent().setValue(content.toString());
    }
  }

}