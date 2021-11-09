package com.jsf.primefaces;

import javax.inject.Named;
import java.time.LocalDate;

@Named
public class DatePickerBean {
    private LocalDate localDate;

    public DatePickerBean() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
