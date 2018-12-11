package com.raywenderlich.android.imet.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/imet/ui/list/PeoplesListViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "peopleList", "Landroid/arch/lifecycle/MediatorLiveData;", "", "Lcom/raywenderlich/android/imet/data/model/People;", "peopleRepository", "Lcom/raywenderlich/android/imet/data/PeopleRepository;", "getAllPeople", "", "getPeopleList", "Landroid/arch/lifecycle/LiveData;", "searchPeople", "name", "", "app_debug"})
public final class PeoplesListViewModel extends android.arch.lifecycle.AndroidViewModel {
    private final com.raywenderlich.android.imet.data.PeopleRepository peopleRepository = null;
    private final android.arch.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> peopleList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> getPeopleList() {
        return null;
    }
    
    public final void getAllPeople() {
    }
    
    public final void searchPeople(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public PeoplesListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}