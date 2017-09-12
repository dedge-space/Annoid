/*
 * Copyright (C) 2014-present, Wei Chou (weichou2010@gmail.com)
 *
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
 */

package hobby.wei.c.anno.inject;

import java.lang.annotation.*;

/**
 * @author Wei Chou(weichou2010@gmail.com)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited    //若不加这个，则子类将无法获得父类的注解，使用后可获得，并且如果子类使用了和父类相同的注解，则父类的注解将被擦除，非常好
public @interface ViewListId {
    int value() default 0;

    String name() default "";
}
