// Generated by Dagger (https://dagger.dev).
package com.example.kelineyt.viewmodel;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public LoginViewModel_Factory(Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<FirebaseAuth> firebaseAuthProvider) {
    return new LoginViewModel_Factory(firebaseAuthProvider);
  }

  public static LoginViewModel newInstance(FirebaseAuth firebaseAuth) {
    return new LoginViewModel(firebaseAuth);
  }
}
