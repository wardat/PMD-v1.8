/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
*/
package test.net.sourceforge.pmd.util;

import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * tests for the net.sourceforge.pmd.util package
 *
 * @author Boris Gruschko ( boris at gruschko.org )
 * @version $Id: UtilTests.java,v 1.1 2004/07/14 16:37:21 ngjanice Exp $
 */
public class UtilTests
{
  /**
   * test suite
   *
   * @return test suite
   */
  public static Test suite(  )
  {
    TestSuite suite = new TestSuite( "Test for test.net.sourceforge.pmd.util" );

    //$JUnit-BEGIN$
    suite.addTestSuite( ApplierTest.class );
    suite.addTestSuite( StringUtilTest.class );

    //$JUnit-END$
    return suite;
  }
}


/*
 * $Log: UtilTests.java,v $
 * Revision 1.1  2004/07/14 16:37:21  ngjanice
 * 14 juillet 2004 - 12h32
 *
 * Revision 1.2  2003/11/21 21:22:17  tomcopeland
 * Continuing to clean up license headers
 *
 * Revision 1.1  2003/09/29 14:32:33  tomcopeland
 * Committed regression test suites, thanks to Boris Gruschko
 *
 */
