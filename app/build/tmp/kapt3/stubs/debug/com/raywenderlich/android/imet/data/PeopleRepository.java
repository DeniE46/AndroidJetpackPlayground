package com.raywenderlich.android.imet.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/raywenderlich/android/imet/data/PeopleRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "peopleDao", "Lcom/raywenderlich/android/imet/data/db/PeopleDao;", "findPeople", "Landroid/arch/lifecycle/LiveData;", "Lcom/raywenderlich/android/imet/data/model/People;", "id", "", "findPeopleByName", "", "name", "", "getAllPeople", "insertPeople", "", "people", "app_debug"})
public final class PeopleRepository {
    private final com.raywenderlich.android.imet.data.db.PeopleDao peopleDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> getAllPeople() {
        return null;
    }
    
    public final void insertPeople(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.imet.data.model.People people) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.raywenderlich.android.imet.data.model.People> findPeople(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> findPeopleByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public PeopleRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}