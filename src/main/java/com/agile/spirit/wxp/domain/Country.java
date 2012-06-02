package com.agile.spirit.wxp.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Country {
  ENGLAND(new String[]{"East England", "North West England", "North East England", "South East England", "South West England", "Greater London", "East Midlands", "West Midlands", "Yorkshire and the Humber"}), //
  FRANCE(new String[]{"Alsace", "Aquitaine", "Auvergne", "Bourgogne", "Bretagne", "Centre", "Champagne-Ardenne", "Corse", "Franche-Comt�", "Ile-de-France", "Languedoc-Roussillon", "Limousin", "Lorraine", "Midi-Pyr�n�es", "Nord-Pas-de-Calais", "Basse-Normandie", "Haute-Normandie", "Pays de la Loire", "Picardie", "Poitou-Charentes", "Provence-Alpes-C�te d'Azur", "Rh�ne-Alpes", "Guadeloupe", "Guyane", "Martinique", "Mayotte", "La R�union"}),//
  GERMANY(new String[]{}),//
  ITALY(new String[]{}),//
  SPAIN(new String[]{}),//
  OTHER(new String[]{});

  private final String[] areas;

  private Country(final String[] areas) {
    this.areas = areas;
  }

  public String[] getAreas() {
    return areas;
  }

  public List<String> getAreasList() {
    if (areas == null || areas.length == 0) {
      return Collections.emptyList();
    }
    return Arrays.asList(areas);
  }

}
