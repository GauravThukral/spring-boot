/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.configurationsample.record;

/**
 * Example Record Javadoc sample
 *
 * @param someString very long description that doesn't fit single line
 * @param someInteger description with @param and @ pitfalls
 * @param someBoolean description with extra spaces
 * @param someLong description without space after asterisk
 * @param someByte last description in Javadoc
 * @since 1.0.0
 * @author Pavel Anisimov
 */
@org.springframework.boot.configurationsample.ConfigurationProperties("record.descriptions")
public record ExampleRecord(String someString, Integer someInteger, Boolean someBoolean, Long someLong, Byte someByte) {
}
