package com.kscapser.rest.api.spock.client.mdoel;

import java.util.ArrayList;
import java.util.List;

public class Clouds {
    private float all;


    // Getter Methods

    public float getAll() {
        return all;
    }

    // Setter Methods

    public void setAll(float all) {
        this.all = all;
    }

    public static class Codebeautify {
        Coord CoordObject;
        List<Object> weather = new ArrayList<>();
        Main MainObject;
        Wind WindObject;
        Clouds CloudsObject;
        Sys SysObject;
        private String base;
        private float visibility;
        private float dt;
        private float id;
        private String name;
        private float cod;


        // Getter Methods

        public Coord getCoord() {
            return CoordObject;
        }

        public void setCoord(Coord coordObject) {
            this.CoordObject = coordObject;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public Main getMain() {
            return MainObject;
        }

        public void setMain(Main mainObject) {
            this.MainObject = mainObject;
        }

        public float getVisibility() {
            return visibility;
        }

        public void setVisibility(float visibility) {
            this.visibility = visibility;
        }

        public Wind getWind() {
            return WindObject;
        }

        public void setWind(Wind windObject) {
            this.WindObject = windObject;
        }

        public Clouds getClouds() {
            return CloudsObject;
        }

        // Setter Methods

        public void setClouds(Clouds cloudsObject) {
            this.CloudsObject = cloudsObject;
        }

        public float getDt() {
            return dt;
        }

        public void setDt(float dt) {
            this.dt = dt;
        }

        public Sys getSys() {
            return SysObject;
        }

        public void setSys(Sys sysObject) {
            this.SysObject = sysObject;
        }

        public float getId() {
            return id;
        }

        public void setId(float id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getCod() {
            return cod;
        }

        public void setCod(float cod) {
            this.cod = cod;
        }
    }
}
