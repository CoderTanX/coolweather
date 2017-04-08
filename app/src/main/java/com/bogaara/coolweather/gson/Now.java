package com.bogaara.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by donghong on 17/4/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
