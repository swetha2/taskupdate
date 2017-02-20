/**
 * Created by swetha on 16/2/17.
 */

import {fromJS} from 'immutable';
import { dashboardReducer } from '../../src/reducers/dashboardReducer';
import chai from 'chai';
import * as React from "react";

const initialState = fromJS({});

describe('Dashboard Reducer', () => {
    it('getTeamReport', () => {
        const action = {
            type: 'GET_TEAM_REPORT',
            teamReportData: {
                        "categoryCount": [],
                        "effortCount": [],
                        "isSubmitted": true,
                        "taskCompleted": 0,
                        "taskScheduled": 1,
                        "timeSpentOnPriority": null,
                        "totalScheduledTime": 0
                  },
    };
        const newState = dashboardReducer(initialState, action);
       chai.expect(newState.getIn(['teamReport','isSubmitted'])).to.equals(true)
    });
});

