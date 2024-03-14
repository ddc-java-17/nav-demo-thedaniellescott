package edu.cnm.deepdive.navdemo.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;

public class CommonViewModel extends AndroidViewModel {

  private final MutableLiveData<String> sharedContent;

  public CommonViewModel(@NotNull Application application) {
    super(application);
    sharedContent = new MutableLiveData<>();
  }

  public MutableLiveData<String> getSharedContent() {
    return sharedContent;
  }

}
