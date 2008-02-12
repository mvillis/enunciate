/*
 * Copyright 2006 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.modules.gwt;

import java.math.BigInteger;

/**
 * @author Ryan Heaton
 */
public class BigIntegerGWTMapper implements GWTMapper<BigInteger, String> {

  public String toGWT(BigInteger jaxbObject, GWTMappingContext context) throws GWTMappingException {
    return jaxbObject == null ? null : jaxbObject.toString();
  }

  public BigInteger toJAXB(String gwtObject, GWTMappingContext context) throws GWTMappingException {
    return gwtObject == null ? null : new BigInteger(gwtObject);
  }
}