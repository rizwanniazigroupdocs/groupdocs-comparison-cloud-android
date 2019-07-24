/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */
package com.groupdocs.cloud.comparison.api;

import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.Options;
import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.ComparisonsRequest;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class ComparisonsSlideTests extends BaseApiTest
{

    @Test
    public void comparisonsSlide() throws ApiException
    {
        Options comparisonOptions = GetComparisonOptions(TestFiles.SourceSlide, Arrays.asList(TestFiles.TargetSlide));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getHref(), "/resultFilePath/result.pptx");
    }

    @Test @Ignore("Fixed in Comparison 19.4")
    public void comparisonsSlidePassword() throws ApiException
    {
        Options comparisonOptions = GetComparisonOptions(TestFiles.SourceSlideProtected, Arrays.asList(TestFiles.TargetSlideProtected));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getHref(), "/resultFilePath/result.pptx");
    }

    @Test @Ignore("Fixed in Comparison 19.4")
    public void comparisonsSlideMulti() throws ApiException
    {
        Options comparisonOptions = GetComparisonOptions(TestFiles.SourceSlide,
                Arrays.asList(
                        TestFiles.TargetSlide,
                        TestFiles.TargetSlide1,
                        TestFiles.TargetSlide2));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getHref(), "/resultFilePath/result.pptx");
    }

    @Test @Ignore("Fixed in Comparison 19.4")
    public void comparisonsSlideMultiPassword() throws ApiException
    {
        Options comparisonOptions = GetComparisonOptions(TestFiles.SourceSlideProtected,
                Arrays.asList(
                        TestFiles.TargetSlideProtected,
                        TestFiles.TargetSlide1Protected,
                        TestFiles.TargetSlide2Protected));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getHref(), "/resultFilePath/result.pptx");
    }
}