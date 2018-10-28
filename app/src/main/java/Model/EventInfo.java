package Model;

import android.location.Location;

import java.sql.Time;

public class EventInfo {

    private String _title;
    private String _username;
    private Time _time;
    private Location _location;
    private String _info;

    public EventInfo(String title, String username, Time time, Location location, String info){
        _title = title;
        _username = username;
        _time = time;
        _location = location;
        _info = info;
    }

    //Getters
    public String get_title(){ return _title; }
    public String get_username(){ return _username; }
    public Time get_time() { return _time; }
    public Location get_location() { return _location; }
    public String get_info() { return _info;  }

    //Setters
    public void set_title(String _title) { this._title = _title; }
    public void set_username(String _username) { this._username = _username; }
    public void set_time(Time _time) { this._time = _time; }
    public void set_location(Location _location) { this._location = _location; }
    public void set_info(String _info) { this._info = _info; }

    public String toString(){
        return "";
    }

    public String toJSON(){
        return "";
    }
}
