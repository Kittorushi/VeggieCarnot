package com.veggie.android.simpeldesa.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0002\u00a2\u0006\u0002\u0010&J\u0012\u0010\'\u001a\u00020(2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010)\u001a\u00020(2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020\u0005H\u0002J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J&\u0010\b\u001a\u00020(2\u001e\u00105\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u000106j\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u0001`8R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e\u00a8\u00069"}, d2 = {"Lcom/veggie/android/simpeldesa/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Landroid/widget/ArrayAdapter;", "", "getAdapter", "()Landroid/widget/ArrayAdapter;", "setAdapter", "(Landroid/widget/ArrayAdapter;)V", "empty", "getEmpty", "()Ljava/lang/String;", "setEmpty", "(Ljava/lang/String;)V", "filterEnable", "getFilterEnable", "setFilterEnable", "flag", "getFlag", "setFlag", "homeViewModel", "Lcom/veggie/android/simpeldesa/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/veggie/android/simpeldesa/ui/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/veggie/android/simpeldesa/adapter/VegiAdapter;", "getMAdapter", "()Lcom/veggie/android/simpeldesa/adapter/VegiAdapter;", "setMAdapter", "(Lcom/veggie/android/simpeldesa/adapter/VegiAdapter;)V", "selectedFilter", "getSelectedFilter", "setSelectedFilter", "fillStatesArrayList", "", "()[Ljava/lang/String;", "initObserver", "", "initObserverFilterd", "selectedFromList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openDialog", "openDialogSort", "arrayList", "Ljava/util/ArrayList;", "Lcom/veggie/android/simpeldesa/api/models/veggie/RecordsItem;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String flag = "Default";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filterEnable = "disable";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedFilter = "gujarat";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String empty = "empty";
    @org.jetbrains.annotations.Nullable()
    private com.veggie.android.simpeldesa.adapter.VegiAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.veggie.android.simpeldesa.ui.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFlag() {
        return null;
    }
    
    public final void setFlag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilterEnable() {
        return null;
    }
    
    public final void setFilterEnable(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedFilter() {
        return null;
    }
    
    public final void setSelectedFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmpty() {
        return null;
    }
    
    public final void setEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.veggie.android.simpeldesa.adapter.VegiAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.veggie.android.simpeldesa.adapter.VegiAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.veggie.android.simpeldesa.api.models.veggie.RecordsItem> arrayList) {
    }
    
    private final void initObserver(java.lang.String flag) {
    }
    
    private final void initObserverFilterd(java.lang.String flag, java.lang.String selectedFromList) {
    }
    
    public final void openDialog() {
    }
    
    public final void openDialogSort() {
    }
    
    private final java.lang.String[] fillStatesArrayList() {
        return null;
    }
    
    public HomeFragment() {
        super();
    }
}