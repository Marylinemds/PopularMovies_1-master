package com.example.android.popularmovies1.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Maryline on 3/26/2017.
 */

public class MoviesContentProvider extends ContentProvider {

    public MoviesDbHelper mMoviesDbHelper;

    public static final int FAVORITES = 100;
    public static final int FAVORITE_WITH_ID = 101;

    public static final UriMatcher sUriMatcher = buildUriMatcher();

    public static UriMatcher buildUriMatcher(){
        UriMatcher UriMatcher = new UriMatcher(android.content.UriMatcher.NO_MATCH);

        UriMatcher.addURI(MoviesContract.AUTHORITY, MoviesContract.PATH_FAVORITE, FAVORITES);
        UriMatcher.addURI(MoviesContract.AUTHORITY, MoviesContract.PATH_FAVORITE + "/#", FAVORITE_WITH_ID);

        return UriMatcher;

    }


    @Override
    public boolean onCreate() {
        Context context = getContext();
        mMoviesDbHelper = new MoviesDbHelper(context);

        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}
