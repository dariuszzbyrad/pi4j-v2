package com.pi4j.library.pigpio;

/*-
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: LIBRARY  :: PIGPIO Library
 * FILENAME      :  PiGpioMode.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2019 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import static com.pi4j.library.pigpio.PiGpioConst.*;

public enum PiGpioMode {
    UNKNOWN(-1),
    INPUT  (PI_INPUT),
    OUTPUT (PI_OUTPUT),
    ALT0   (PI_ALT0),
    ALT1   (PI_ALT1),
    ALT2   (PI_ALT2),
    ALT3   (PI_ALT3),
    ALT4   (PI_ALT4),
    ALT5   (PI_ALT5);

    private int value;

    PiGpioMode(int value){
        this.value  =value;
    }

    public int value(){
        return this.value;
    }

    public static PiGpioMode from(Number value){
        for(PiGpioMode c : PiGpioMode.values()){
            if(c.value() == value.intValue()) return c;
        }
        return UNKNOWN;
    }
}
