package com.raywenderlich.android.imet.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "items", "", "Lcom/raywenderlich/android/imet/data/model/People;", "clickListener", "Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class PeoplesListAdapter extends android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.raywenderlich.android.imet.data.model.People> items = null;
    private final com.raywenderlich.android.imet.ui.list.PeoplesListAdapter.OnItemClickListener clickListener = null;
    
    /**
     * * Creates view for each item in the list
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * * Binds view with item info
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    /**
     * * Returns the size to item list
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PeoplesListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.imet.data.model.People> items, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.imet.ui.list.PeoplesListAdapter.OnItemClickListener clickListener) {
        super();
    }
    
    /**
     * * Notifies click on an item with attached view
     */
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$OnItemClickListener;", "", "onItemClick", "", "people", "Lcom/raywenderlich/android/imet/data/model/People;", "itemView", "Landroid/view/View;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.imet.data.model.People people, @org.jetbrains.annotations.NotNull()
        android.view.View itemView);
    }
    
    /**
     * * View for item, sets item info and click events
     */
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "people", "Lcom/raywenderlich/android/imet/data/model/People;", "listener", "Lcom/raywenderlich/android/imet/ui/list/PeoplesListAdapter$OnItemClickListener;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.imet.data.model.People people, @org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.imet.ui.list.PeoplesListAdapter.OnItemClickListener listener) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}