/*
 * Copyright (C) 2010-2018 Gordon Fraser, Andrea Arcuri and EvoSuite
 * contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3.0 of the License, or
 * (at your option) any later version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
package com.examples.with.different.packagename.mock.java.time;

import java.time.Clock;

/**
 * Created by gordon on 25/01/2016.
 */
public class ClockExample {

    public long testMe(Clock clock) {
        return clock.millis();
    }

    public boolean testMe2(long millis) {
        Clock clock = Clock.systemDefaultZone();
        if(clock.millis() == millis)
            return true;
        else
            return false;
    }

    public boolean testMe3(long millis) {
        Clock clock = Clock.systemUTC();
        if(clock.millis() == millis)
            return true;
        else
            return false;
    }

}
