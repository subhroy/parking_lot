package com.gojek.parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
  private String regNo;
  private String color;
}
