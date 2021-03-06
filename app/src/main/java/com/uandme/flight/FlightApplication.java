package com.uandme.flight;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.uandme.flight.data.dao.DaoMaster;
import com.uandme.flight.data.dao.DaoSession;
import com.uandme.flight.network.MoccApi;
import com.uandme.flight.network.MoccApiImpl;

/**
 * Created by QingYang on 15/7/19.
 */
public class FlightApplication extends Application {
    private static Context sContext;

    @Override public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        initDatabase();
    }

    public static Context getContext() {
        return sContext;
    }

    public static MoccApi getMoccApi() {
        return new MoccApiImpl();
    }

    private static DaoSession sDaoSession;


    private void initDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "flight." + BuildConfig.APP_SPORT_TYPE, null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        sDaoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession() {
        return sDaoSession;
    }
}
