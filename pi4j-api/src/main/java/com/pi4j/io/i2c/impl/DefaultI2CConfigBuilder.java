package com.pi4j.io.i2c.impl;

/*-
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: LIBRARY  :: Java Library (API)
 * FILENAME      :  DefaultI2CConfigBuilder.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2019 Pi4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.pi4j.io.i2c.I2CConfig;
import com.pi4j.io.i2c.I2CConfigBuilder;
import com.pi4j.io.impl.IOConfigBuilderBase;

/**
 * <p>DefaultI2CConfigBuilder class.</p>
 *
 * @author Robert Savage (<a href="http://www.savagehomeautomation.com">http://www.savagehomeautomation.com</a>)
 * @version $Id: $Id
 */
public class DefaultI2CConfigBuilder
        extends IOConfigBuilderBase<I2CConfigBuilder, I2CConfig>
        implements I2CConfigBuilder {

    /**
     * PRIVATE CONSTRUCTOR
     */
    protected DefaultI2CConfigBuilder(){
        super();
    }

    /**
     * <p>newInstance.</p>
     *
     * @return a {@link com.pi4j.io.i2c.I2CConfigBuilder} object.
     */
    public static I2CConfigBuilder newInstance() {
        return new DefaultI2CConfigBuilder();
    }

    /** {@inheritDoc} */
    @Override
    public I2CConfig build() {
        I2CConfig config = new DefaultI2CConfig(properties);
        return config;
    }

    /** {@inheritDoc} */
    @Override
    public I2CConfigBuilder bus(Integer bus){
        this.properties.put(I2CConfig.BUS_KEY, bus.toString());
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public I2CConfigBuilder device(Integer device){
        this.properties.put(I2CConfig.DEVICE_KEY, device.toString());
        return this;
    }
}
