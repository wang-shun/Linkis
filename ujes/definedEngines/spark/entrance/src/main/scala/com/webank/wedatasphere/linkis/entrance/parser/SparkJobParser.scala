/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.entrance.parser

import com.webank.wedatasphere.linkis.entrance.annotation.EntranceParserBeanAnnotation
import com.webank.wedatasphere.linkis.entrance.condition.SparkJobParserCondition
import com.webank.wedatasphere.linkis.entrance.execute.EntranceJob
import com.webank.wedatasphere.linkis.entrance.job.SparkEntranceJob
import org.springframework.context.annotation.Conditional

/**
  * Created by allenlliu on 2019/4/17.
  */
@EntranceParserBeanAnnotation
@Conditional(Array(classOf[SparkJobParserCondition]))
class SparkJobParser extends CommonEntranceParser {

  override def createEntranceJob(): EntranceJob = new SparkEntranceJob

}