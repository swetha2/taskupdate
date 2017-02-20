/**
 * Created by swetha on 16/2/17.
 */
import {expect} from 'chai';
import 'mocha-sinon';
import { dashboardAction } from '../../src/actions/dashboardActions';

describe("TeamsReport component tests", () => {

    it('has a Today tab ', () => {
        const today_tab = {
            title: 'Today',
            date: 1487399400000
        };
        expect(today_tab.title = 'Today');
        expect(today_tab.date = 1487399400000);
    });

    it('has a All tab ', () => {
        const all_tab = {
            type: 'All',
            reportFilter: true
        };
        expect(all_tab.type = 'All');
        expect(all_tab.reportFilter = 'Today');
    });

    it('has a Submitted tab ', () => {
        const submitted_tab = {
            type: 'Today',
            reportFilter: true
        };
        expect(submitted_tab.type = 'Today');
        expect(submitted_tab.reportFilter = true);
    });

    it('has a NotSubmitted tab ', () => {
        const notsubmitted_tab = {
            type: 'Today',
            reportFilter: true
        };
        expect(notsubmitted_tab.type = 'Today');
        expect(notsubmitted_tab.reportFilter = true);
    });

    it('has a Calendar tab ', () => {
        const calendar_tab = {
            date: 1487399400000,
            type: 'date',
            path: 'team-report/date/'
        };
        expect(calendar_tab.date = 1487399400000);
        expect(calendar_tab.type = 'date');
        expect(calendar_tab.path = 'team-report/date/');
    });
});
