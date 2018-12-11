package com.raywenderlich.android.imet.ui.list;

import java.lang.System;

/**
 * * The Fragment to show people list
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\rH\u0016J\u001a\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010&\u001a\u00020\r2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0(H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/raywenderlich/android/imet/ui/list/PeoplesListFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$OnItemClickListener;", "Landroid/support/v7/widget/SearchView$OnQueryTextListener;", "Landroid/support/v7/widget/SearchView$OnCloseListener;", "()V", "searchView", "Landroid/support/v7/widget/SearchView;", "viewModel", "Lcom/raywenderlich/android/imet/ui/list/PeoplesListViewModel;", "onClose", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "people", "Lcom/raywenderlich/android/imet/data/model/People;", "itemView", "onQueryTextChange", "newText", "", "onQueryTextSubmit", "query", "onResume", "onViewCreated", "view", "populatePeopleList", "peopleList", "", "app_debug"})
public final class PeoplesListFragment extends android.support.v4.app.Fragment implements com.raywenderlich.android.imet.ui.list.PeoplesListAdapter.OnItemClickListener, android.support.v7.widget.SearchView.OnQueryTextListener, android.support.v7.widget.SearchView.OnCloseListener {
    private android.support.v7.widget.SearchView searchView;
    private com.raywenderlich.android.imet.ui.list.PeoplesListViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * Callback for searchView text change
     */
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
        return false;
    }
    
    /**
     * * Callback for searchView query submit
     */
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    /**
     * * Callback for searchView close
     */
    @java.lang.Override()
    public boolean onClose() {
        return false;
    }
    
    /**
     * * Populates peopleRecyclerView with all people info
     */
    private final void populatePeopleList(java.util.List<com.raywenderlich.android.imet.data.model.People> peopleList) {
    }
    
    /**
     * * Navigates to people details on item click
     */
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.imet.data.model.People people, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
    }
    
    public PeoplesListFragment() {
        super();
    }
}