package oat.tryaspectj;

import oat.tryaspectj.StudentTest.StudentDeleteTest;
import oat.tryaspectj.StudentTest.StudentRegistrationTest;
import oat.tryaspectj.StudentTest.StudentRetrieveTest;
import oat.tryaspectj.StudentTest.StudentUpdateTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Test Suite for All Unit Test Of TryJunit5")
@SelectClasses({
        StudentRegistrationTest.class,
        StudentRetrieveTest.class,
        StudentDeleteTest.class,
        StudentUpdateTest.class
})
class TryAspectJApplicationTests {}
