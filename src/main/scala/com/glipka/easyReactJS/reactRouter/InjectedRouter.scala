/*
 # Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
/*
 # Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
/*# Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
package com.glipka.easyReactJS.reactRouter

import scala.scalajs.js
import com.glipka.easyReactJS.react._
import GlobalDefinition._

@js.native
trait InjectedRouter extends js.Any {
  val push: (js.Any) => Unit = js.native
  val replace: (js.Any) => Unit = js.native
  val go: (js.Any) => Unit = js.native
  def goBack: () => Unit = js.native
  def goForward: () => Unit = js.native
  def setRouteLeaveHook(route: PlainRoute, callback: RouteHook): Unit = js.native
  def createPath(path: js.Any, query: js.Any): js.Any = js.native
  def createHref(path: js.Any, query: js.Any): js.Any = js.native
  val isActive: (js.Any, Boolean) => Boolean = js.native
}