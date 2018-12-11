package com.raywenderlich.android.imet.data.db;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.raywenderlich.android.imet.data.model.People.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/android/imet/data/db/PeopleDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "peopleDao", "Lcom/raywenderlich/android/imet/data/db/PeopleDao;", "Companion", "app_debug"})
public abstract class PeopleDatabase extends android.arch.persistence.room.RoomDatabase {
    private static final java.lang.Object lock = null;
    private static final java.lang.String DB_NAME = "People.db";
    private static com.raywenderlich.android.imet.data.db.PeopleDatabase INSTANCE;
    public static final com.raywenderlich.android.imet.data.db.PeopleDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.imet.data.db.PeopleDao peopleDao();
    
    public PeopleDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/android/imet/data/db/PeopleDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Lcom/raywenderlich/android/imet/data/db/PeopleDatabase;", "lock", "getInstance", "application", "Landroid/app/Application;", "prePopulate", "", "database", "peopleList", "", "Lcom/raywenderlich/android/imet/data/model/People;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.android.imet.data.db.PeopleDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        public final void prePopulate(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.imet.data.db.PeopleDatabase database, @org.jetbrains.annotations.NotNull()
        java.util.List<com.raywenderlich.android.imet.data.model.People> peopleList) {
        }
        
        private Companion() {
            super();
        }
    }
}