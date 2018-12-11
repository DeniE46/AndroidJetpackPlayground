package com.raywenderlich.android.imet.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/android/imet/ui/details/PeopleDetailsViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "peopleId", "Landroid/arch/lifecycle/MutableLiveData;", "", "peopleRepository", "Lcom/raywenderlich/android/imet/data/PeopleRepository;", "getPeopleDetails", "Landroid/arch/lifecycle/LiveData;", "Lcom/raywenderlich/android/imet/data/model/People;", "id", "app_debug"})
public final class PeopleDetailsViewModel extends android.arch.lifecycle.AndroidViewModel {
    private final com.raywenderlich.android.imet.data.PeopleRepository peopleRepository = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> peopleId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.raywenderlich.android.imet.data.model.People> getPeopleDetails(int id) {
        return null;
    }
    
    public PeopleDetailsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}