package com.veggie.android.simpeldesa.api.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/veggie/android/simpeldesa/api/requests/VeggieServices;", "", "listFilterVeggie", "Lcom/veggie/android/simpeldesa/api/models/veggie/VegiModel;", "API_KEY", "", "paging", "", "limit", "mandiName", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listVeggie", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface VeggieServices {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "9ef84268-d588-465a-a308-a864a43d0070")
    @retrofit2.http.Headers(value = {"Accept: application/json", "Content-Type: application/json"})
    public abstract java.lang.Object listFilterVeggie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String API_KEY, @retrofit2.http.Query(value = "offset")
    int paging, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "filters[state]")
    java.lang.String mandiName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.veggie.android.simpeldesa.api.models.veggie.VegiModel> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "9ef84268-d588-465a-a308-a864a43d0070")
    @retrofit2.http.Headers(value = {"Accept: application/json", "Content-Type: application/json"})
    public abstract java.lang.Object listVeggie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String API_KEY, @retrofit2.http.Query(value = "offset")
    int paging, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.veggie.android.simpeldesa.api.models.veggie.VegiModel> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}