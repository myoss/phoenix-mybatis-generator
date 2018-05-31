/*
 * Copyright 2018-2018 https://github.com/myoss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.myoss.phoenix.mybatis.generator.db.dialect.impl;

import com.github.myoss.phoenix.mybatis.generator.db.dialect.DatabaseDialect;
import com.github.myoss.phoenix.mybatis.generator.db.dialect.DatabaseDialects;

/**
 * MySQL数据库方言
 *
 * @author Jerry.Chen
 * @since 2018年5月15日 下午1:43:17
 */
public class MySqlDialect implements DatabaseDialect {
    @Override
    public String getDatabaseName() {
        return DatabaseDialects.MYSQL.getDatabaseName();
    }

    @Override
    public String getBeginningDelimiter() {
        return "`";
    }

    @Override
    public String getEndingDelimiter() {
        return "`";
    }
}
