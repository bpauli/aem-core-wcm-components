/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models;

import java.util.List;
import java.util.Map;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Defines the {@code AmpPage} Sling Model used for AMP extension for the {@code /apps/core/wcm/components/page/v2/page} component.
 *
 * @since com.adobe.cq.wcm.core.components.models 12.14.0
 */
@ConsumerType
public interface AmpPage {

    /**
     * Getter for the relative page link to either the AMP version or base HTML version of the page.
     *
     * @return the page link
     */
    default Map<String, String> getPageLinkAttrs() {
        throw new UnsupportedOperationException();
    }

    /**
     * Getter for the list of customheadlibs.amp.html files in components on the page.
     *
     * @return list of files to include
     */
    default List<String> getHeadlibIncludes() {
        throw new UnsupportedOperationException();
    }
}
