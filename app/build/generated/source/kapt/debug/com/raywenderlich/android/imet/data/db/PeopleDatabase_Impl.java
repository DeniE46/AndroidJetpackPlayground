package com.raywenderlich.android.imet.data.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class PeopleDatabase_Impl extends PeopleDatabase {
  private volatile PeopleDao _peopleDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `People` (`name` TEXT NOT NULL, `metAt` TEXT NOT NULL, `contact` TEXT NOT NULL, `email` TEXT NOT NULL, `facebook` TEXT NOT NULL, `twitter` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"73424f507b18f9f81fd5acecdb2f853d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `People`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPeople = new HashMap<String, TableInfo.Column>(7);
        _columnsPeople.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsPeople.put("metAt", new TableInfo.Column("metAt", "TEXT", true, 0));
        _columnsPeople.put("contact", new TableInfo.Column("contact", "TEXT", true, 0));
        _columnsPeople.put("email", new TableInfo.Column("email", "TEXT", true, 0));
        _columnsPeople.put("facebook", new TableInfo.Column("facebook", "TEXT", true, 0));
        _columnsPeople.put("twitter", new TableInfo.Column("twitter", "TEXT", true, 0));
        _columnsPeople.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPeople = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPeople = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPeople = new TableInfo("People", _columnsPeople, _foreignKeysPeople, _indicesPeople);
        final TableInfo _existingPeople = TableInfo.read(_db, "People");
        if (! _infoPeople.equals(_existingPeople)) {
          throw new IllegalStateException("Migration didn't properly handle People(com.raywenderlich.android.imet.data.model.People).\n"
                  + " Expected:\n" + _infoPeople + "\n"
                  + " Found:\n" + _existingPeople);
        }
      }
    }, "73424f507b18f9f81fd5acecdb2f853d", "cd977b0455249506ab490ec63868edab");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "People");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `People`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PeopleDao peopleDao() {
    if (_peopleDao != null) {
      return _peopleDao;
    } else {
      synchronized(this) {
        if(_peopleDao == null) {
          _peopleDao = new PeopleDao_Impl(this);
        }
        return _peopleDao;
      }
    }
  }
}
