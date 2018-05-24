/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
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
 */

package org.sablecc.objectmacro.codegeneration.java;

import java.io.*;

import org.sablecc.objectmacro.codegeneration.*;
import org.sablecc.objectmacro.codegeneration.java.macro.*;
import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;
import org.sablecc.objectmacro.intermediate.syntax3.node.*;

public class UtilsGenerationWalker
        extends DepthFirstAdapter {

    private final IntermediateRepresentation ir;

    private File packageDirectory;

    public UtilsGenerationWalker(
            IntermediateRepresentation ir,
            File packageDirectory) {

        this.ir = ir;
        this.packageDirectory = packageDirectory;
    }

    @Override
    public void caseAIntermediateRepresentation(
            AIntermediateRepresentation node) {

        MContext mContext = new MContext();

        MExParameterNull mParameterNull = new MExParameterNull();
        MExIncorrectType mIncorrectType = new MExIncorrectType();
        MExObjectMacroErrorHead mObjectMacroErrorHead
                = new MExObjectMacroErrorHead();
        MExMacroNullInList mMacroNullInList = new MExMacroNullInList();
        MExCyclicReference mCyclicReference = new MExCyclicReference();
        MExCannotModify mCannotModify = new MExCannotModify();
        MExObjectMacroException mObjectMacroException
                = new MExObjectMacroException();
        MExVersionNull mExVersionNull = new MExVersionNull();
        MExVersionsDifferent mExVersionsDifferent = new MExVersionsDifferent();
        MExInternalException mExInternalException = new MExInternalException();
        MMacroInternalException mMacroInternalException
                = new MMacroInternalException();

        MClassInternalValue mClassInternalValue = new MClassInternalValue();
        MClassBuildState mClassBuildState = new MClassBuildState();
        MCycleDetectorClass mTarjanClass = new MCycleDetectorClass();

        MSuperDirective mSuperDirective = new MSuperDirective();
        MClassAfterLast mClassAfterLast = new MClassAfterLast();
        MClassBeforeFirst mClassBeforeFirst = new MClassBeforeFirst();
        MClassNone mClassNone = new MClassNone();
        MClassSeparator mClassSeparator = new MClassSeparator();

        if (!this.ir.getDestinationPackage().equals("")) {
            String destinationPackage = this.ir.getDestinationPackage();
            MPackageDeclaration mPackageDeclaration
                    = new MPackageDeclaration(destinationPackage);
            mContext.addPackageDeclaration(mPackageDeclaration);
            mIncorrectType.addPackageDeclaration(mPackageDeclaration);
            mParameterNull.addPackageDeclaration(mPackageDeclaration);
            mObjectMacroErrorHead.addPackageDeclaration(mPackageDeclaration);
            mMacroNullInList.addPackageDeclaration(mPackageDeclaration);
            mCyclicReference.addPackageDeclaration(mPackageDeclaration);
            mCannotModify.addPackageDeclaration(mPackageDeclaration);
            mObjectMacroException.addPackageDeclaration(mPackageDeclaration);
            mClassInternalValue.addPackageDeclaration(mPackageDeclaration);
            mSuperDirective.addPackageDeclaration(mPackageDeclaration);
            mClassAfterLast.addPackageDeclaration(mPackageDeclaration);
            mClassBeforeFirst.addPackageDeclaration(mPackageDeclaration);
            mClassNone.addPackageDeclaration(mPackageDeclaration);
            mClassSeparator.addPackageDeclaration(mPackageDeclaration);
            mClassBuildState.addPackageDeclaration(mPackageDeclaration);
            mTarjanClass.addPackageDeclaration(mPackageDeclaration);
            mExVersionNull.addPackageDeclaration(mPackageDeclaration);
            mExVersionsDifferent.addPackageDeclaration(mPackageDeclaration);
            mExInternalException.addPackageDeclaration(mPackageDeclaration);
            mMacroInternalException.addPackageDeclaration(mPackageDeclaration);
        }

        GenerationUtils.writeFile(this.packageDirectory, "Context.java",
                mContext.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorIncorrectType.java", mIncorrectType.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorParameterNull.java", mParameterNull.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MObjectMacroUserErrorHead.java",
                mObjectMacroErrorHead.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorMacroNullInList.java", mMacroNullInList.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorCyclicReference.java", mCyclicReference.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorCannotModify.java", mCannotModify.build());
        GenerationUtils.writeFile(this.packageDirectory,
                "ObjectMacroException.java", mObjectMacroException.build());
        GenerationUtils.writeFile(this.packageDirectory, "InternalValue.java",
                mClassInternalValue.build());
        GenerationUtils.writeFile(this.packageDirectory, "Directive.java",
                mSuperDirective.build());
        GenerationUtils.writeFile(this.packageDirectory, "DAfterLast.java",
                mClassAfterLast.build());
        GenerationUtils.writeFile(this.packageDirectory, "DBeforeFirst.java",
                mClassBeforeFirst.build());
        GenerationUtils.writeFile(this.packageDirectory, "DNone.java",
                mClassNone.build());
        GenerationUtils.writeFile(this.packageDirectory, "DSeparator.java",
                mClassSeparator.build());

        GenerationUtils.writeFile(this.packageDirectory, "BuildState.java",
                mClassBuildState.build());
        GenerationUtils.writeFile(this.packageDirectory, "CycleDetector.java",
                mTarjanClass.build());

        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorVersionNull.java", mExVersionNull.build());

        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorVersionsDifferent.java",
                mExVersionsDifferent.build());

        GenerationUtils.writeFile(this.packageDirectory,
                "InternalException.java", mExInternalException.build());

        GenerationUtils.writeFile(this.packageDirectory,
                "MUserErrorInternalException.java",
                mMacroInternalException.build());
    }
}