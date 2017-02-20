/**
 * Created by swetha on 17/2/17.
 */
import 'mocha-sinon';
import {expect} from 'chai';
import * as Actions from '../../src/actions/dashboardActions';

describe("teamsreport action tests", () => {

    it('will return teams report data ', () => {
        expect(Actions.getTeamReport().type).equals("GET_TEAM_REPORT");
    });
});
