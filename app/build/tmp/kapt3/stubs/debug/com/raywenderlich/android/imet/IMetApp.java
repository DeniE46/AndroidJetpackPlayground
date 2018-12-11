package com.raywenderlich.android.imet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/android/imet/IMetApp;", "Landroid/app/Application;", "()V", "getPeopleRepository", "Lcom/raywenderlich/android/imet/data/PeopleRepository;", "app_debug"})
public final class IMetApp extends android.app.Application {
    
    /**
     * * Provides centralised Repository throughout the app
     */
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.imet.data.PeopleRepository getPeopleRepository() {
        return null;
    }
    
    public IMetApp() {
        super();
    }
}