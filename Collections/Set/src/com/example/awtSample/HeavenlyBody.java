package com.example.awtSample;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.BodyType;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public enum BodyType{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType=bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon){
            return this.satellites.add(moon);

    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    public boolean equals(HeavenlyBody obj){
        if (this == obj){
            return true;
        }

        System.out.println("obj.getClass() is "+ obj.getClass());
        System.out.println("this.getClass() is "+ this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {

        return this.name.hashCode()+57 +this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name+": " +this.bodyType+ ", "+ this.orbitalPeriod;
    }
}
