package oat.tryaspectj;

import oat.tryaspectj.student_mock_test.script.StudentDeleteTest;
import oat.tryaspectj.student_mock_test.script.StudentRegistrationTest;
import oat.tryaspectj.student_mock_test.script.StudentRetrieveTest;
import oat.tryaspectj.student_mock_test.script.StudentUpdateTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Test Suite for All Unit Test Of Junit 5 + mockito")
@SelectClasses({
        StudentRegistrationTest.class,
        StudentRetrieveTest.class,
        StudentDeleteTest.class,
        StudentUpdateTest.class
})
class TryAspectJApplicationTests {}
