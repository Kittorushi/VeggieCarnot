package com.veggie.android.simpeldesa.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/veggie/android/simpeldesa/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "veggieRepository", "Lcom/veggie/android/simpeldesa/repository/VeggieRepository;", "(Lcom/veggie/android/simpeldesa/repository/VeggieRepository;)V", "_text", "Landroidx/lifecycle/MutableLiveData;", "", "errorMessage", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "text", "Landroidx/lifecycle/LiveData;", "getText", "()Landroidx/lifecycle/LiveData;", "veggieFilterList", "Lcom/veggie/android/simpeldesa/api/models/veggie/VegiModel;", "getVeggieFilterList", "veggieList", "getVeggieList", "vmGetFilterListVeggie", "", "selectedFromList", "vmGetListVeggie", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.veggie.android.simpeldesa.repository.VeggieRepository veggieRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _text = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> text = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.veggie.android.simpeldesa.api.models.veggie.VegiModel> veggieList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.veggie.android.simpeldesa.api.models.veggie.VegiModel> veggieFilterList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.veggie.android.simpeldesa.repository.VeggieRepository veggieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.veggie.android.simpeldesa.api.models.veggie.VegiModel> getVeggieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.veggie.android.simpeldesa.api.models.veggie.VegiModel> getVeggieFilterList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void vmGetListVeggie() {
    }
    
    public final void vmGetFilterListVeggie(@org.jetbrains.annotations.NotNull
    java.lang.String selectedFromList) {
    }
}