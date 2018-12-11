package com.raywenderlich.android.imet.data.db;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.raywenderlich.android.imet.data.model.People;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class PeopleDao_Impl implements PeopleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPeople;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PeopleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPeople = new EntityInsertionAdapter<People>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `People`(`name`,`metAt`,`contact`,`email`,`facebook`,`twitter`,`id`) VALUES (?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, People value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getMetAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMetAt());
        }
        if (value.getContact() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContact());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getFacebook() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFacebook());
        }
        if (value.getTwitter() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTwitter());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM People";
        return _query;
      }
    };
  }

  @Override
  public void insert(People people) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPeople.insert(people);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<People>> getAll() {
    final String _sql = "SELECT * FROM People ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<People>>() {
      private Observer _observer;

      @Override
      protected List<People> compute() {
        if (_observer == null) {
          _observer = new Observer("People") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfMetAt = _cursor.getColumnIndexOrThrow("metAt");
          final int _cursorIndexOfContact = _cursor.getColumnIndexOrThrow("contact");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfFacebook = _cursor.getColumnIndexOrThrow("facebook");
          final int _cursorIndexOfTwitter = _cursor.getColumnIndexOrThrow("twitter");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final List<People> _result = new ArrayList<People>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final People _item;
            _item = new People();
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpMetAt;
            _tmpMetAt = _cursor.getString(_cursorIndexOfMetAt);
            _item.setMetAt(_tmpMetAt);
            final String _tmpContact;
            _tmpContact = _cursor.getString(_cursorIndexOfContact);
            _item.setContact(_tmpContact);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _item.setEmail(_tmpEmail);
            final String _tmpFacebook;
            _tmpFacebook = _cursor.getString(_cursorIndexOfFacebook);
            _item.setFacebook(_tmpFacebook);
            final String _tmpTwitter;
            _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            _item.setTwitter(_tmpTwitter);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<People> find(int id) {
    final String _sql = "SELECT * FROM People WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return new ComputableLiveData<People>() {
      private Observer _observer;

      @Override
      protected People compute() {
        if (_observer == null) {
          _observer = new Observer("People") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfMetAt = _cursor.getColumnIndexOrThrow("metAt");
          final int _cursorIndexOfContact = _cursor.getColumnIndexOrThrow("contact");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfFacebook = _cursor.getColumnIndexOrThrow("facebook");
          final int _cursorIndexOfTwitter = _cursor.getColumnIndexOrThrow("twitter");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final People _result;
          if(_cursor.moveToFirst()) {
            _result = new People();
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result.setName(_tmpName);
            final String _tmpMetAt;
            _tmpMetAt = _cursor.getString(_cursorIndexOfMetAt);
            _result.setMetAt(_tmpMetAt);
            final String _tmpContact;
            _tmpContact = _cursor.getString(_cursorIndexOfContact);
            _result.setContact(_tmpContact);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _result.setEmail(_tmpEmail);
            final String _tmpFacebook;
            _tmpFacebook = _cursor.getString(_cursorIndexOfFacebook);
            _result.setFacebook(_tmpFacebook);
            final String _tmpTwitter;
            _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            _result.setTwitter(_tmpTwitter);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<People>> findBy(String name) {
    final String _sql = "SELECT * FROM people WHERE name LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return new ComputableLiveData<List<People>>() {
      private Observer _observer;

      @Override
      protected List<People> compute() {
        if (_observer == null) {
          _observer = new Observer("people") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfMetAt = _cursor.getColumnIndexOrThrow("metAt");
          final int _cursorIndexOfContact = _cursor.getColumnIndexOrThrow("contact");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfFacebook = _cursor.getColumnIndexOrThrow("facebook");
          final int _cursorIndexOfTwitter = _cursor.getColumnIndexOrThrow("twitter");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final List<People> _result = new ArrayList<People>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final People _item;
            _item = new People();
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpMetAt;
            _tmpMetAt = _cursor.getString(_cursorIndexOfMetAt);
            _item.setMetAt(_tmpMetAt);
            final String _tmpContact;
            _tmpContact = _cursor.getString(_cursorIndexOfContact);
            _item.setContact(_tmpContact);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _item.setEmail(_tmpEmail);
            final String _tmpFacebook;
            _tmpFacebook = _cursor.getString(_cursorIndexOfFacebook);
            _item.setFacebook(_tmpFacebook);
            final String _tmpTwitter;
            _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            _item.setTwitter(_tmpTwitter);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
