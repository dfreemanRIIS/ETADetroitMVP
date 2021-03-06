package dfreemanRIIS.ETADetroit.presenter;

import android.content.Context;
import android.database.Cursor;

import dfreemanRIIS.ETADetroit.model.DatabaseHelper;

public class RouteDetailPresenter {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getRouteDetails(routeName);
    }

    public Cursor getRouteStops(String route_id, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getRouteStops(route_id);
    }

}
