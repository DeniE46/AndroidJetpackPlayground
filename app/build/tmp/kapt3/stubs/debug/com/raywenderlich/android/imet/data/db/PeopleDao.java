package com.raywenderlich.android.imet.data.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/android/imet/data/db/PeopleDao;", "", "deleteAll", "", "find", "Landroid/arch/lifecycle/LiveData;", "Lcom/raywenderlich/android/imet/data/model/People;", "id", "", "findBy", "", "name", "", "getAll", "insert", "people", "app_debug"})
public abstract interface PeopleDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM People ORDER BY id DESC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.imet.data.model.People people);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM People")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM People WHERE id = :id")
    public abstract android.arch.lifecycle.LiveData<com.raywenderlich.android.imet.data.model.People> find(int id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM people WHERE name LIKE \'%\' || :name || \'%\'")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.raywenderlich.android.imet.data.model.People>> findBy(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}