/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "mi" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_mi extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "AM",
        "PM"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "y MMMM d, EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "y MMMM d";
  }

  @Override
  public String dateFormatMedium() {
    return "y MMM d";
  }

  @Override
  public String dateFormatShort() {
    return "y-MM-dd";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "BCE",
        "CE"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "BCE",
        "CE"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 1;
  }

  @Override
  public String formatDay() {
    return "d";
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss";
  }

  @Override
  public String formatHour24Minute() {
    return "HH:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH:mm:ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "MMM d";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "MMMM d, EEEE";
  }

  @Override
  public String formatMonthNumDay() {
    return "MM-dd";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "y MMM";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "y MMM d";
  }

  @Override
  public String formatYearMonthFull() {
    return "y MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "y MMMM d";
  }

  @Override
  public String formatYearMonthNum() {
    return "y-MM";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "y-M-d";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "y MMM d, EEE";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "Kohitātea",
        "Huitanguru",
        "Poutūterangi",
        "Paengawhāwhā",
        "Haratua",
        "Pipiri",
        "Hōngongoi",
        "Hereturikōkā",
        "Mahuru",
        "Whiringa-ā-nuku",
        "Whiringa-ā-rangi",
        "Hakihea"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "K",
        "H",
        "P",
        "P",
        "H",
        "P",
        "H",
        "H",
        "M",
        "N",
        "R",
        "H"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Kohi",
        "Hui",
        "Pou",
        "Pae",
        "Hara",
        "Pipi",
        "Hōngo",
        "Here",
        "Mahu",
        "Nuku",
        "Rangi",
        "Haki"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "Hauwhā tuatahi",
        "Hauwhā tuarua",
        "Hauwhā tuatoru",
        "Hauwhā tuawhā"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "HW1",
        "HW2",
        "HW3",
        "HW4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "Rātapu",
        "Rāhina",
        "Rātū",
        "Rāapa",
        "Rāpare",
        "Rāmere",
        "Rāhoroi"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "T",
        "H",
        "T",
        "A",
        "P",
        "M",
        "H"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Tap",
        "Hin",
        "Tū",
        "Apa",
        "Par",
        "Mer",
        "Hor"
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return weekdaysShort();
  }

  @Override
  public int weekendEnd() {
    return 0;
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
