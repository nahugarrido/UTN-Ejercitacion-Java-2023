package interfaces;

import org.json.JSONException;
import org.json.JSONObject;

public interface I_ToJSON {
    JSONObject toJSON() throws JSONException;

    /*void fromJSON(JSONObject json_object) throws JSONException;*/
}
